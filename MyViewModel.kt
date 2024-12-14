import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MyViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(MyUiState())
    val uiState: StateFlow<MyUiState> = _uiState

    fun updateName(name: String) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(name = name)
        }
    }
    fun updateAge(age: Int) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(age = age)
        }
    }
}

data class MyUiState(
    val name: String = "",
    val age: Int = 0
)