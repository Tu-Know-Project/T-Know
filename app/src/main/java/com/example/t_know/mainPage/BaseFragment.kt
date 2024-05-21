import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import kotlinx.coroutines.Job

abstract class BaseFragment<V: ViewBinding>(
    @LayoutRes val layoutResource: Int,
    private val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> V
) : Fragment() {

    private lateinit var fetchJob: Job

    private var _binding: V? = null
    protected val binding: V get() = _binding!!

    init {
        // Initialize fetchJob in the constructor
        fetchJob = Job()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = bindingInflater(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Additional code can go here
    }

    fun showToastMessage(message: String) {
        val toast = Toast.makeText(activity, message, Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        if (::fetchJob.isInitialized && fetchJob.isActive) {
            fetchJob.cancel()
        }
        _binding = null
    }
}

