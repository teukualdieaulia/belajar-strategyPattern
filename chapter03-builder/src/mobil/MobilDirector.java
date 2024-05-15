package mobil;

public class MobilDirector {
    private static MobilDirector director = null;

    private MobilDirector() {
    }

    public static synchronized MobilDirector getInstance();

  }
}