package statics;

public enum ReaderType {
    SINH_VIEN ("Sinh viên"),
    HOC_VIEN_CAO_HOC ("Học viên cao học"),
    GIAO_VIEN ("giáo viên");

    public String name;

    ReaderType(String name) {
        this.name = name;
    }
}
