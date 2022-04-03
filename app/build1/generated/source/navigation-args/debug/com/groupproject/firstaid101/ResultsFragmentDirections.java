package com.groupproject.firstaid101;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ResultsFragmentDirections {
  private ResultsFragmentDirections() {
  }

  @NonNull
  public static ActionResultsFragmentToViewProcedureFragment actionResultsFragmentToViewProcedureFragment(
      @NonNull Procedure Procedure) {
    return new ActionResultsFragmentToViewProcedureFragment(Procedure);
  }

  public static class ActionResultsFragmentToViewProcedureFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionResultsFragmentToViewProcedureFragment(@NonNull Procedure Procedure) {
      if (Procedure == null) {
        throw new IllegalArgumentException("Argument \"Procedure\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Procedure", Procedure);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionResultsFragmentToViewProcedureFragment setProcedure(@NonNull Procedure Procedure) {
      if (Procedure == null) {
        throw new IllegalArgumentException("Argument \"Procedure\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Procedure", Procedure);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("Procedure")) {
        Procedure Procedure = (Procedure) arguments.get("Procedure");
        if (Parcelable.class.isAssignableFrom(Procedure.class) || Procedure == null) {
          __result.putParcelable("Procedure", Parcelable.class.cast(Procedure));
        } else if (Serializable.class.isAssignableFrom(Procedure.class)) {
          __result.putSerializable("Procedure", Serializable.class.cast(Procedure));
        } else {
          throw new UnsupportedOperationException(Procedure.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        }
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_resultsFragment_to_viewProcedureFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public Procedure getProcedure() {
      return (Procedure) arguments.get("Procedure");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionResultsFragmentToViewProcedureFragment that = (ActionResultsFragmentToViewProcedureFragment) object;
      if (arguments.containsKey("Procedure") != that.arguments.containsKey("Procedure")) {
        return false;
      }
      if (getProcedure() != null ? !getProcedure().equals(that.getProcedure()) : that.getProcedure() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getProcedure() != null ? getProcedure().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionResultsFragmentToViewProcedureFragment(actionId=" + getActionId() + "){"
          + "Procedure=" + getProcedure()
          + "}";
    }
  }
}
