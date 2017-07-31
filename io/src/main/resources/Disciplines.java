public enum Disciplines {
    JAVA, THEOLOGY, MATH, GEOGRAPHY;

    public String gradeType() {
        switch (this) {
            case JAVA:
            case MATH:
                return "Double";
            case GEOGRAPHY:
            case THEOLOGY:
                return "Integer";
            default:
                return "Default";
        }
    }
}