package com.bcq.adapter.interfaces;

import android.view.View;
import android.widget.ListView;

import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * 通用适配器接口
 *
 * @param <T>  数据类型
 * @param <VH> ViewHolder类型
 */
public interface IAdapte<T, VH extends IHolder> {

    /**
     * @param refreshView 列表展示
     * @param <V>
     */
    <V extends View> void setRefreshView(V refreshView);

    void setDataObserver(DataObserver observer);

    /**
     * 设置数据
     *
     * @param list
     * @param refresh
     */
    void setData(List<T> list, boolean refresh);


    /**
     * 获取数据
     *
     * @return data
     */
    List<T> getData();

    /**
     * 获取指定索引的数据对象
     *
     * @param position
     * @return
     */
    T getItem(int position);

    /**
     * 移除
     *
     * @param item
     * @return
     */
    boolean removeItem(T item);

    void updateItem(int position, T t);

    /**
     * 根据position 和 数据 获取itemView的布局id
     *
     * @param item
     * @param position
     * @return
     */
    int getItemLayoutId(T item, int position);

    /**
     * 绑定数据
     *
     * @param vh
     * @param t
     * @param position 索引
     * @param layoutId 布局id 多种布局时返回
     */
    void convert(VH vh, T t, int position, int layoutId);
}
