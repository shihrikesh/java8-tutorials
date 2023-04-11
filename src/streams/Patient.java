package streams;

import java.util.Objects;

public class Patient {

    private String name;
    private String region;
    private Integer id;

    private HealthStatus healthStatus;

    public HealthStatus getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(HealthStatus healthStatus) {
        this.healthStatus = healthStatus;
    }

    public Patient(Integer id, String name, String region, HealthStatus healthStatus){
        this.id = id;
        this.name = name;
        this.region = region;
        this.healthStatus = healthStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(name, patient.name) && Objects.equals(region, patient.region) && Objects.equals(id, patient.id);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", id=" + id +
                ", healthStatus=" + healthStatus +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, region, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
