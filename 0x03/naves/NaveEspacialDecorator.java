public class NaveEspacialDecorator extends NaveEspacial {

    private NaveEspacial naveDecorada;

    public NaveEspacialDecorator(NaveEspacial naveDecorada) {
        super(naveDecorada.getSaude(), naveDecorada.getAtaque());
        setNaveDecorada(naveDecorada);
    }

    @Override
    public int getSaude() {
        return super.getSaude();
    }

    @Override
    public int getAtaque() {
        return super.getAtaque();
    }

    public NaveEspacial getNaveDecorada() {
        return naveDecorada;
    }

    public void setNaveDecorada(NaveEspacial naveDecorada) {
        this.naveDecorada = naveDecorada;
    }

}
