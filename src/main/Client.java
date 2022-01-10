package main;

public class Client {
    private int Id;
    private String CompanyName;
    private CompanySize companySize;
    private int NrEmpl;
    private int Incomes;
    private String Location;

    public Client(int Id, CompanySize companySize, int NrEmpl, int Incomes, String Location)
    {
        this.Id = Id;
        this.companySize = companySize;
        this.NrEmpl = NrEmpl;
        this.Incomes = Incomes;
        this.Location = Location;
    }

    @Override
    public String toString() {
        return "Client{" +
                "Id=" + Id +
                ", CompanyName='" + CompanyName + '\'' +
                ", companySize=" + companySize +
                ", NrEmpl=" + NrEmpl +
                ", Incomes=" + Incomes +
                ", Location='" + Location + '\'' +
                '}';
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public CompanySize getCompanySize() {
        return companySize;
    }

    public void setCompanySize(CompanySize companySize) {
        this.companySize = companySize;
    }

    public int getNrEmpl() {
        return NrEmpl;
    }

    public void setNrEmpl(int nrEmpl) {
        NrEmpl = nrEmpl;
    }

    public int getIncomes() {
        return Incomes;
    }

    public void setIncomes(int incomes) {
        Incomes = incomes;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }


}
