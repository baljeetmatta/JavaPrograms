class Car
{
    String color;
    int model;
    //GETTER ,SETTER
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color=color;

    }
    public int getModel()
    {
        return this.model;

    }
    public void setModel(int model)
    {
        this.model=model;
    }
    public void init(String color,int model)
    {
        //Instance Variable Hiding
        //Local Variable -> Instance Match
        //this->Reference ->Current caller object
        this.color=color;
        this.model=model;

    }

}