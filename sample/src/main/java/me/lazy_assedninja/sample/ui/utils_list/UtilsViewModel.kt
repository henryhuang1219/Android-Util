package me.lazy_assedninja.sample.ui.utils_list

import androidx.lifecycle.ViewModel
import me.lazy_assedninja.sample.repository.UtilsRepository
import me.lazy_assedninja.sample.vo.Utils
import javax.inject.Inject

class UtilsViewModel @Inject constructor(
    private val utilsRepository: UtilsRepository
) : ViewModel() {

    fun loadUtils(): List<Utils> {
        return utilsRepository.loadUtils()
    }
}