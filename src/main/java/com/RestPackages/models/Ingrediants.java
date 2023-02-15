package com.RestPackages.models;

public class Ingrediants {
	private int coffeePowderInGrams;
	private int teaPowder;
	private int steamInPressure;
	private Float milkInLiters;
	private Float waterInLiters;
	
	public int getCoffeePowderInGrams() {
		return coffeePowderInGrams;
	}

	public void setCoffeePowderInGrams(int coffeePowderInGrams) {
		this.coffeePowderInGrams = coffeePowderInGrams;
	}

	public int getTeaPowder() {
		return teaPowder;
	}

	public void setTeaPowder(int teaPowder) {
		this.teaPowder = teaPowder;
	}

	public int getSteamInPressure() {
		return steamInPressure;
	}

	public void setSteamInPressure(int steamInPressure) {
		this.steamInPressure = steamInPressure;
	}

	public Float getMilkInLiters() {
		return milkInLiters;
	}

	public void setMilkInLiters(Float milkInLiters) {
		this.milkInLiters = milkInLiters;
	}

	public Float getWaterInLiters() {
		return waterInLiters;
	}

	public void setWaterInLiters(Float waterInLiters) {
		this.waterInLiters = waterInLiters;
	}
	
	
	public Ingrediants(int coffeePowderInGrams, int teaPowder, int steamInPressure, Float milkInLiters,
			Float waterInLiters) {
		super();
		this.coffeePowderInGrams = coffeePowderInGrams;
		this.teaPowder = teaPowder;
		this.steamInPressure = steamInPressure;
		this.milkInLiters = milkInLiters;
		this.waterInLiters = waterInLiters;
	}

	public Ingrediants() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ingrediants [coffeePowderInGrams=" + coffeePowderInGrams + ", teaPowder=" + teaPowder
				+ ", steamInPressure=" + steamInPressure + ", milkInLiters=" + milkInLiters + ", waterInLiters="
				+ waterInLiters + "]";
	}
	
	
}
