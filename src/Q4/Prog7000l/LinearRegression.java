package Q4.Prog7000l;

import java.util.Arrays;
public class LinearRegression {
    private double theta0; // y-intercept
    private double theta1; // slope
    private double alpha; // learning rate
    private double tolerance; // cost threshold
    private double[] objective; //cost per epoch

    public LinearRegression(double thetaOne, double thetaZero, double learningRate, double tol) {
        theta0 = thetaZero;
        theta1 = thetaOne;
        alpha = learningRate;
        tolerance = tol;
    }

    public String toString() {
        return "Regression line: y = " + theta1 + " * x + " + theta0 +
                "\nObjective: " + Arrays.toString(objective) +
                "\nMin. Objective: " + (double)Arrays.stream(objective).min().getAsDouble();
    }

    public double getIntercept() {return theta0;}
    public double getSlope() {return theta1;}
    public double predict(double x) {return theta1 * x + theta0; }

    public void fit(double[][] X_train, double[] y_train, int epochs) {
        int m = X_train.length;
        objective = new double[epochs];
        double[] e = new double[m];

        for (int epoch = 0; epoch < epochs; epoch++) {
            if (epoch > 0) {
                double temp0 = 0, temp1 = 0;
                // RHS of gradient dissent
                for (int i = 0; i < m; i++) {
                    //Predicted label - actual label
                    double temp = (theta1 * X_train[i][0] + theta0) - y_train[i];
                    temp0 += temp;
                    temp1 += temp * X_train[i][0];

                }

                theta0 -= (1.0/m) * alpha * temp0;
                theta1 -= (1.0/m) * alpha * temp0;
            }
        }
    }
}
