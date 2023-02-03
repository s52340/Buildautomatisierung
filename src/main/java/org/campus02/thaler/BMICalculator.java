package org.campus02.thaler;

public class BMICalculator {
    private double weightInKG;

    private double heightInMeters;

    public BMICalculator(double weightInKG, double heightInMeters) {
        this.weightInKG = weightInKG;
        this.heightInMeters = heightInMeters;
    }

    public double getWeightInKG() {
        return weightInKG;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    private double calculateBMI(){
        return weightInKG / (heightInMeters * heightInMeters);
    }

    //bmiGrenzen
    // <18,5 = underweight
    // 18,5 - 25 normal
    // 25 - 30 overweight
    // >30 obese
    public String result (){
        double bmi = calculateBMI();
        if (bmi < 18.5){
            return "underweight";
        } else if (bmi < 25) {
            return "normal";
        } else if (bmi < 30) {
            return "overweight";
        }else {
            return "obvious";
        }
    }
}
