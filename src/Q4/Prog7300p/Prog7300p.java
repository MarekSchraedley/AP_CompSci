package Q4.Prog7300p;

import java.util.Arrays;

public class Prog7300p {
    public static void main(String[] args) {
        // AND neuron
        double[][] X_train = {
            {0, 0},
            {0, 1},
            {1, 0},
            {1, 1}
        };

        double[] y_train = {0, 0, 0, 1};

        System.out.println("AND neuron:");
        var model = new Perceptron(0.1, 15);
        model.fit(X_train, y_train);

        // Predict using the trained model
        double[] y_pred = model.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_train));
        System.out.println("Actual: " + Arrays.toString(y_train));

        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());

        //or not nand nor

        X_train = new double[][]{
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        y_train = new double[]{0, 1, 1, 1};

        System.out.println("OR neuron:");
        model = new Perceptron(0.1, 15);
        model.fit(X_train, y_train);

        // Predict using the trained model
        y_pred = model.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_train));
        System.out.println("Actual: " + Arrays.toString(y_train));

        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());

        X_train = new double[][]{
                {0},
                {1},
        };
        y_train = new double[]{1, 0};

        System.out.println("NOT neuron:");
        model = new Perceptron(0.1, 15);
        model.fit(X_train, y_train);

        // Predict using the trained model
        y_pred = model.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_train));
        System.out.println("Actual: " + Arrays.toString(y_train));

        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());

        X_train = new double[][]{
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        y_train = new double[]{1, 1, 1, 0};

        System.out.println("NAND neuron:");
        model = new Perceptron(0.1, 15);
        model.fit(X_train, y_train);

        // Predict using the trained model
        y_pred = model.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_train));
        System.out.println("Actual: " + Arrays.toString(y_train));

        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());

        X_train = new double[][]{
                {0, 0},
                {0, 1},
                {1, 0},
                {1, 1}
        };
        y_train = new double[]{1, 0, 0, 0};

        System.out.println("NOR neuron:");
        model = new Perceptron(0.1, 15);
        model.fit(X_train, y_train);

        // Predict using the trained model
        y_pred = model.predict(X_train);
        System.out.println("Predicted: " + Arrays.toString(y_train));
        System.out.println("Actual: " + Arrays.toString(y_train));

        System.out.println("Weights: " + Arrays.toString(model.getWeights()));
        System.out.println("Bias: " + model.getBias());
    }
}
