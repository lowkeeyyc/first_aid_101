package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.groupproject.firstaid101.DataBinderMapperImpl());
  }
}
