// Generated by data binding compiler. Do not edit!
package com.groupproject.firstaid101.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.groupproject.firstaid101.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemTipBinding extends ViewDataBinding {
  @NonNull
  public final TextView tipContext;

  @NonNull
  public final TextView tipName;

  protected ItemTipBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView tipContext, TextView tipName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tipContext = tipContext;
    this.tipName = tipName;
  }

  @NonNull
  public static ItemTipBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_tip, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemTipBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemTipBinding>inflateInternal(inflater, R.layout.item_tip, root, attachToRoot, component);
  }

  @NonNull
  public static ItemTipBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_tip, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemTipBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemTipBinding>inflateInternal(inflater, R.layout.item_tip, null, false, component);
  }

  public static ItemTipBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemTipBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemTipBinding)bind(component, view, R.layout.item_tip);
  }
}
