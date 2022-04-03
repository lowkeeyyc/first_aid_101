package com.groupproject.firstaid101;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeFragmentToResultsFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_resultsFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToTipsFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_tipsFragment);
  }
}
