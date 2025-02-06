import java.util.*;


public interface PhoneClassifier {
    // defnition of vector (string)
    String classify(double x, double y, double z, List<double[]> trainingData, List<String> labels);
    
} 


// NN Classifer 
class Nearest_Neighbour implements PhoneClassifier {
    @Override
    public String classify(double x, double y, double z, List<double[]> trainingData, List<String> labels) {
    
        return "Nearest Neighbour Classifier";
    }

}

// KNN Classifier 
class K_Nearest_Neighbour implements PhoneClassifier {
    @Override
    public String classify(double x, double y, double z, List<double[]> trainingData, List<String> labels) {
        // Some code 
        return "K Nearest Neighbour Classifier";
    }
}

// Dummy Classifier 
class Another_Classifier implements PhoneClassifier {
    // print that dummy classifer was used 
    @Override
    public String classify(double x, double y, double z, List<double[]> trainingData, List<String> labels) {
        System.out.print("Dummy Classifier was used");
        return "Unknown";
    }
}

