class vivanbasepolicy{

    final void verifyIdentity(){
        System.out.println("Student vivan identify verified via biometric");
    }
}

class advancedstudent extends vivanbasepolicy{

    void verifyIdentity(){
        System.out.println("check");
    }
}


public class finalmethod{

    public static void main(String[] args) {
        
        advancedstudent ad = new advancedstudent();
        ad.verifyIdentity();
    }

}