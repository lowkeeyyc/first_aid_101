package com.groupproject.firstaid101;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgs;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ViewProcedureFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private ViewProcedureFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private ViewProcedureFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ViewProcedureFragmentArgs fromBundle(@NonNull Bundle bundle) {
    ViewProcedureFragmentArgs __result = new ViewProcedureFragmentArgs();
    bundle.setClassLoader(ViewProcedureFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("Procedure")) {
      Procedure Procedure;
      if (Parcelable.class.isAssignableFrom(Procedure.class) || Serializable.class.isAssignableFrom(Procedure.class)) {
        Procedure = (Procedure) bundle.get("Procedure");
      } else {
        throw new UnsupportedOperationException(Procedure.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      if (Procedure == null) {
        throw new IllegalArgumentException("Argument \"Procedure\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("Procedure", Procedure);
    } else {
      throw new IllegalArgumentException("Required argument \"Procedure\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static ViewProcedureFragmentArgs fromSavedStateHandle(
      @NonNull SavedStateHandle savedStateHandle) {
    ViewProcedureFragmentArgs __result = new ViewProcedureFragmentArgs();
    if (savedStateHandle.contains("Procedure")) {
      Procedure Procedure;
      Procedure = savedStateHandle.get("Procedure");
      if (Procedure == null) {
        throw new IllegalArgumentException("Argument \"Procedure\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("Procedure", Procedure);
    } else {
      throw new IllegalArgumentException("Required argument \"Procedure\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Procedure getProcedure() {
    return (Procedure) arguments.get("Procedure");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
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

  @SuppressWarnings("unchecked")
  @NonNull
  public SavedStateHandle toSavedStateHandle() {
    SavedStateHandle __result = new SavedStateHandle();
    if (arguments.containsKey("Procedure")) {
      Procedure Procedure = (Procedure) arguments.get("Procedure");
      if (Parcelable.class.isAssignableFrom(Procedure.class) || Procedure == null) {
        __result.set("Procedure", Parcelable.class.cast(Procedure));
      } else if (Serializable.class.isAssignableFrom(Procedure.class)) {
        __result.set("Procedure", Serializable.class.cast(Procedure));
      } else {
        throw new UnsupportedOperationException(Procedure.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    ViewProcedureFragmentArgs that = (ViewProcedureFragmentArgs) object;
    if (arguments.containsKey("Procedure") != that.arguments.containsKey("Procedure")) {
      return false;
    }
    if (getProcedure() != null ? !getProcedure().equals(that.getProcedure()) : that.getProcedure() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getProcedure() != null ? getProcedure().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "ViewProcedureFragmentArgs{"
        + "Procedure=" + getProcedure()
        + "}";
  }

  public static final class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(@NonNull ViewProcedureFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(@NonNull Procedure Procedure) {
      if (Procedure == null) {
        throw new IllegalArgumentException("Argument \"Procedure\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Procedure", Procedure);
    }

    @NonNull
    public ViewProcedureFragmentArgs build() {
      ViewProcedureFragmentArgs result = new ViewProcedureFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setProcedure(@NonNull Procedure Procedure) {
      if (Procedure == null) {
        throw new IllegalArgumentException("Argument \"Procedure\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("Procedure", Procedure);
      return this;
    }

    @SuppressWarnings({"unchecked","GetterOnBuilder"})
    @NonNull
    public Procedure getProcedure() {
      return (Procedure) arguments.get("Procedure");
    }
  }
}
