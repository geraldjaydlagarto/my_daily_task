package co.geraldjaydlagarto.mydailytask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.geraldjaydlagarto.mydailytask.ui.detail.TaskDetailScreen
import co.geraldjaydlagarto.mydailytask.ui.edit.EditTaskScreen
import co.geraldjaydlagarto.mydailytask.ui.list.TaskListScreen
import co.geraldjaydlagarto.mydailytask.ui.theme.MyDailyTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyDailyTaskTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Content()
                }
            }
        }
    }
}

@Composable
fun Content() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "task_list") {
        composable("task_list") {
            TaskListScreen(
                onSelectTask = {
                    navController.navigate("task_detail")
                },
                onAddTask = {
                    navController.navigate("edit_task")
                })
        }
        composable("task_detail") {
            TaskDetailScreen(
                onBack = {
                    navController.navigateUp()
                },
                onEditTask = {
                    navController.navigate("edit_task")
                }
            )
        }
        composable("edit_task") {
            EditTaskScreen(
                onBack = {
                    navController.navigateUp()
                },
                onDeleteTask = {

                },
                onSaveTask = {

                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyDailyTaskTheme {
        Content()
    }
}