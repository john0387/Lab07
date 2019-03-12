
public class QueueHospital implements Hospital{
	PatientType p;
	public QueueHospital() {
		
	}
	public void addPatient(PatientType patient) {
		
	}
	public PatientType nextPatient() {
		
	}
	public PatientType treatNextPatient() {
		
	}
	public int numPatients() {
		
	}
	public String hospitalType() {
		
	}
	public String allPatientInfo() {
		
	}
	public String toString()
	{
		return String.format("A %s-type hospital with %d patients.", hospitalType(), numPatients());
	}
}
