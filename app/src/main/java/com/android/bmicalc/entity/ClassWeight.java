package com.android.bmicalc.entity;

import java.util.ArrayList;
import java.util.Objects;

public class ClassWeight {

    private String yourClassWeight;
    private String warning;
    private String possibleRisks;

    public String getYourClassWeight() {
        return yourClassWeight;
    }

    public void setYourClassWeight(String yourClassWeight) {
        this.yourClassWeight = yourClassWeight;
    }

    public String getWarnings() {
        return warning;
    }

    public void setWarnings(String warnings) {
        this.warning = warnings;
    }

    public String getPossibleRisks() {
        return possibleRisks;
    }

    public void setPossibleRisks(String possibleRisks) {
        this.possibleRisks = possibleRisks;
    }

    public ClassWeight() {
    }

    //methods
    public void determineClassWeight(double bmi){
        if(bmi < 18.5){
            this.yourClassWeight = "Abaixo do peso.";
            this.warning = "Atualmente você se encontra abaixo do peso ideal para sua altura!";
            this.possibleRisks = "Atenção! Estando abaixo do peso você corre risco de desenvolver osteoporose, problemas na pele e fraqueza.";
        }
        else if(bmi > 18.5 && bmi <= 24.9){
            this.yourClassWeight = "Peso saudável.";
            this.warning = "Parabéns, você se encontra dentro da faixa de peso ideal para sua altura!";
            this.possibleRisks = "Continue comendo de maneira saudável e se exercitando periódicamente!";
        }
        else if(bmi > 24.9 && bmi <= 29.9){

            this.yourClassWeight = "Peso em excesso.";
            this.warning = "Atenção! Você está com peso em excesso!";
            this.possibleRisks = "Nesta faixa de peso você corre o risco de desenvolver diabetes, problemas cardíacos entre outros...";
        }
        else if(bmi > 29.9 && bmi <= 34.9){
            this.yourClassWeight = "Obesidade grau I.";
            this.warning = "Atenção! Você está na faixa de obesidade de primeiro grau!";
            this.possibleRisks = "Na obesidade grau I você pode desenvolver hipertensão, apnéia do sono, doenças cardiovasculares entre outros...";


        }
        else if(bmi > 34.9 && bmi <= 39.9){
            this.yourClassWeight = "Obesidade grau II.";
            this.warning = "Atenção! Você está na faixa de obesidade de segundo grau!";
            this.possibleRisks = "Na obesidade grau II você pode desenvolver problemas musculares e ósseos, dificuldade de se movimentar, além de diabetes e " +
                    "doenças cardiovasculares.";

        }
        else if(bmi > 39.9){
            this.yourClassWeight = "Obesidade Mórbida.";
            this.warning = "Atenção! Você possui Obesidade mórbida!";
            this.possibleRisks = "Você corre risco de contaminação por fungos, doenças cardiovasculares, dificuldade de movimentação, problemas ósseos " +
                    "e musculares entre outros. Entre em contato com um especialista o quanto antes.";
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassWeight that = (ClassWeight) o;
        return Objects.equals(yourClassWeight, that.yourClassWeight) && Objects.equals(warning, that.warning);
    }

    @Override
    public int hashCode() {
        return Objects.hash(yourClassWeight, warning);
    }

    @Override
    public String toString() {
        return "ClassWeight{" +
                "yourClassWeight='" + yourClassWeight + '\'' +
                ", warnings=" + warning +
                '}';
    }
}
