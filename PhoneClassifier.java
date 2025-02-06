
public interface PhoneClassifier {
    // defnition of vector (string)
    String classify(double x, double y, double z);
} 


// NN Classifer 
class Nearest_Neighbour implements PhoneClassifier {
    @Override
    public String classify(double x, double y, double z) {
        // Some Code
        return "Nearest Neighbour Classifier";
    }

}

// KNN Classifier 
class K_Nearest_Neighbour implements PhoneClassifier {
    @Override
    public String classify(double x, double y, double z) {
        // Some code 
        return "Nearest Neighbour Classifier";

    }
}

// Dummy Classifier 
class Another_Classifier implements PhoneClassifier {
    // print that dummy classifer was used 
    @Override
    public String classify(double x, double y, double z) {
        System.out.print("Dummy Classifier was used");
        return "Unknown";
    }
}

