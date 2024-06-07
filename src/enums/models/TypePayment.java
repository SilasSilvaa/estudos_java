package enums.models;

public enum TypePayment {
    DEBIT {
        @Override
        public double CalculateDiscount(double value) {
            return value * 0.1;
        }
    }, CREDIT {
        @Override
        public double CalculateDiscount(double value) {
            return value * 0.05;
        }
    };

    public abstract double CalculateDiscount(double value);
}
