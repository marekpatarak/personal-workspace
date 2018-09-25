package sk.itvkurze.webinar34._04_builder_pattern;

public class ImmutableOsoba
{
	public static class Builder 
	{
		private int id;
		private String meno;
		private String priezvisko;
		private int vek;
		private boolean jeMuz;
		
		public Builder() 
		{
			
		}
		
		public ImmutableOsoba build()
		{
			return new ImmutableOsoba(this);
		}
		
		public Builder id(int id)
		{
			this.id = id;
			return this;
		}
		
		public Builder meno(String meno)
		{
			this.meno = meno;
			return this;
		}
		
		public Builder priezvisko(String priezvisko)
		{
			this.priezvisko = priezvisko;
			return this;
		}
		
		public Builder vek(int vek)
		{
			this.vek = vek;
			return this;
		}
		
		public Builder jeMuz(boolean jeMuz)
		{
			this.jeMuz = jeMuz;
			return this;
		}
	}
	
	private final int id;
	private final String meno;
	private final String priezvisko;
	private final int vek;
	private final boolean jeMuz;
	
	private ImmutableOsoba(Builder builder)
	{
		this.id = builder.id;
		this.meno = builder.meno;
		this.priezvisko = builder.priezvisko;
		this.vek = builder.vek;
		this.jeMuz = builder.jeMuz;
	}

	public int getId()
	{
		return id;
	}

	public String getMeno()
	{
		return meno;
	}

	public String getPriezvisko()
	{
		return priezvisko;
	}

	public int getVek()
	{
		return vek;
	}

	public boolean jeMuz()
	{
		return jeMuz;
	}
	
}
