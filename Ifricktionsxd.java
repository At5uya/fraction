public interface Ifricktionsxd {

    /**
     * @return the upper part of the fraction
     */
    Integer getNumerator();

    /**
     * @return the bottom part of the fraction
     */
    Integer getDenominator();

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    Ifricktionsxd plus(Ifricktionsxd other);

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    Ifricktionsxd minus(Ifricktionsxd other);

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    Ifricktionsxd times(Ifricktionsxd other);

    /**
     * @param other fraction
     * @return new instance of IFraction representing the result
     */
    Ifricktionsxd dividedBy(Ifricktionsxd other);
}