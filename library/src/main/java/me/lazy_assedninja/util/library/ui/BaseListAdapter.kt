package me.lazy_assedninja.util.library.ui

import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.AsyncDifferConfig
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import me.lazy_assedninja.util.library.util.AppExecutors

/**
 * A generic RecyclerView adapter that uses Data Binding & DiffUtil.
 *
 * @param <T> Type of the items in the list
 * @param <V> The type of the ViewDataBinding
</V></T> */
abstract class BaseListAdapter<T, V : ViewDataBinding>(
    executorUtil: AppExecutors,
    diffCallback: DiffUtil.ItemCallback<T>
) : ListAdapter<T, BaseViewHolder<V>>(
    AsyncDifferConfig.Builder(diffCallback)
        .setBackgroundThreadExecutor(executorUtil.diskIO())
        .build()
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<V> {
        val binding = createBinding(parent)
        return BaseViewHolder(binding)
    }

    protected abstract fun createBinding(parent: ViewGroup): V

    override fun onBindViewHolder(holder: BaseViewHolder<V>, position: Int) {
        bind(holder.binding, getItem(position))
        holder.binding.executePendingBindings()
    }

    protected abstract fun bind(binding: V, item: T)
}