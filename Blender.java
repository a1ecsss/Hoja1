public class Blender implements IBlender {
    private boolean isFull;
    private int speed;
    private final int MAX_SPEED = 10;

    public Blender() {
        this.isFull = false;
        this.speed = 0;
    }

    @Override
    public void SpeedUp() {
        if (isFull && speed < MAX_SPEED) {
            speed++;
            System.out.println("Velocidad aumentada a: " + speed);
        } else if (!isFull) {
            System.out.println("La licuadora está vacía. No puede aumentar la velocidad.");
        } else {
            System.out.println("Velocidad máxima alcanzada.");
        }
    }

    @Override
    public void SpeedDonw() {
        if (speed > 0) {
            speed--;
            System.out.println("Velocidad reducida a: " + speed);
        } else {
            System.out.println("La velocidad ya está en 0.");
        }
    }

    @Override
    public boolean IsFull() {
        return isFull;
    }
} 
