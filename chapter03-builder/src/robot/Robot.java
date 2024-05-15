package robot;

public class Robot {

    private String shield, sword, gun, brainchip;

    public Robot() {
    }

    public String getShield() {
        return shield;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }

    public String getSword() {
        return sword;
    }

    public void setSword(String sword) {
        this.sword = sword;
    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;
    }

    public String getBrainchip() {
        return brainchip;
    }

    public void setBrainchip(String brainchip) {
        this.brainchip = brainchip;
    }

    @Override
    public String toString() {
        return "robot.Robot Properties"
                + "\n-----------"
                + "\nShield: " + getShield()
                + "\nGun: " + getGun()
                + "\nSword: " + getSword()
                + "\nBrain chip: " + getBrainchip();
    }

}