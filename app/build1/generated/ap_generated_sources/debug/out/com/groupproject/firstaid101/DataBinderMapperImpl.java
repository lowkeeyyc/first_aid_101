package com.groupproject.firstaid101;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.groupproject.firstaid101.databinding.FragmentHomeBindingImpl;
import com.groupproject.firstaid101.databinding.FragmentResultsBindingImpl;
import com.groupproject.firstaid101.databinding.FragmentSearchBindingImpl;
import com.groupproject.firstaid101.databinding.FragmentTipsBindingImpl;
import com.groupproject.firstaid101.databinding.FragmentViewProcedureBindingImpl;
import com.groupproject.firstaid101.databinding.ItemProcedureBindingImpl;
import com.groupproject.firstaid101.databinding.ItemTipBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENTHOME = 1;

  private static final int LAYOUT_FRAGMENTRESULTS = 2;

  private static final int LAYOUT_FRAGMENTSEARCH = 3;

  private static final int LAYOUT_FRAGMENTTIPS = 4;

  private static final int LAYOUT_FRAGMENTVIEWPROCEDURE = 5;

  private static final int LAYOUT_ITEMPROCEDURE = 6;

  private static final int LAYOUT_ITEMTIP = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.groupproject.firstaid101.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.groupproject.firstaid101.R.layout.fragment_results, LAYOUT_FRAGMENTRESULTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.groupproject.firstaid101.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.groupproject.firstaid101.R.layout.fragment_tips, LAYOUT_FRAGMENTTIPS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.groupproject.firstaid101.R.layout.fragment_view_procedure, LAYOUT_FRAGMENTVIEWPROCEDURE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.groupproject.firstaid101.R.layout.item_procedure, LAYOUT_ITEMPROCEDURE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.groupproject.firstaid101.R.layout.item_tip, LAYOUT_ITEMTIP);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTRESULTS: {
          if ("layout/fragment_results_0".equals(tag)) {
            return new FragmentResultsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_results is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCH: {
          if ("layout/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTIPS: {
          if ("layout/fragment_tips_0".equals(tag)) {
            return new FragmentTipsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_tips is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVIEWPROCEDURE: {
          if ("layout/fragment_view_procedure_0".equals(tag)) {
            return new FragmentViewProcedureBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_view_procedure is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPROCEDURE: {
          if ("layout/item_procedure_0".equals(tag)) {
            return new ItemProcedureBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_procedure is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMTIP: {
          if ("layout/item_tip_0".equals(tag)) {
            return new ItemTipBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_tip is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/fragment_home_0", com.groupproject.firstaid101.R.layout.fragment_home);
      sKeys.put("layout/fragment_results_0", com.groupproject.firstaid101.R.layout.fragment_results);
      sKeys.put("layout/fragment_search_0", com.groupproject.firstaid101.R.layout.fragment_search);
      sKeys.put("layout/fragment_tips_0", com.groupproject.firstaid101.R.layout.fragment_tips);
      sKeys.put("layout/fragment_view_procedure_0", com.groupproject.firstaid101.R.layout.fragment_view_procedure);
      sKeys.put("layout/item_procedure_0", com.groupproject.firstaid101.R.layout.item_procedure);
      sKeys.put("layout/item_tip_0", com.groupproject.firstaid101.R.layout.item_tip);
    }
  }
}
