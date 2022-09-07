package edu.lernia.labb3;

    class Patient {
    private String name; 
    private String sickness;

    public Patient(String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
    }

    public Patient(String name) {
        this.name = name;  
        this.sickness = null;
    }

    public String getName() {
        return this.name;
    }

    public String getSickness() {
        return this.sickness;
    }

    public boolean isSick() {
        if(this.sickness == null) {
            return false;
        } else {
            return true; 
        }
    }

    public void takeMedication(Medicine medicine) {
        if(medicine.getTreatmentName().equals(this.sickness)) {
            this.sickness = null; 
        }  
    } 
} 