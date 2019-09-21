


@Version(version = 8.0, nameVersion = "OREO")
public class MyService
{
    private double version;
    private String nameVersion;


    public MyService(){
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getNameVersion() {
        return nameVersion;
    }

    public void setNameVersion(String nameVersion) {
        this.nameVersion = nameVersion;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private void thisClassInfo(){
        System.out.println(MyService.class + " [version: " + getVersion() + ", nameVersion: " +  getNameVersion() + "]");
    }
}
