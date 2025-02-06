import java.util.*;


public interface PhoneClassifier {
    // defnition of vector (string)
    String classify(double x, double y, double z, List<double[]> trainingData, List<String> labels);
    
} 


// NN Classifer 
class Nearest_Neighbour implements PhoneClassifier {
    @Override
    public String classify(double x, double y, double z, List<double[]> trainingData, List<String> labels) {
    	 double minDistance = Double.MAX_VALUE;
         int nearestIndex = -1;

         // Loop through training data to find the closest point
         for (int i = 0; i < trainingData.size(); i++) {
             double[] point = trainingData.get(i);
             double distance = Math.sqrt(Math.pow(x - point[0], 2) +
                                         Math.pow(y - point[1], 2) +
                                         Math.pow(z - point[2], 2));

             // Update nearest point if a closer one is found
             if (distance < minDistance) {
                 minDistance = distance;
                 nearestIndex = i;
             }
         }
         return (nearestIndex != -1) ? labels.get(nearestIndex) : "Unknown";
  
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

