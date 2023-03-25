package com.collection.LowLevelDesign;

abstract  class Bird {
    private String type;
    private String name;
    private int weight;
    private String color;
    void breath(){
        System.out.println(this.getName()+" is breathing");
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
