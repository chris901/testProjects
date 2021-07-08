// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public enum DynamicSeries_Names
{
	Series_1(new java.lang.String[][] { new java.lang.String[] { "en_US", "Series 1" } }),
	Series_2(new java.lang.String[][] { new java.lang.String[] { "en_US", "Series 2" } }),
	Series_3(new java.lang.String[][] { new java.lang.String[] { "en_US", "Series 3" } }),
	Series_4(new java.lang.String[][] { new java.lang.String[] { "en_US", "Series 4" } }),
	Series_5(new java.lang.String[][] { new java.lang.String[] { "en_US", "Series 5" } });

	private java.util.Map<java.lang.String, java.lang.String> captions;

	private DynamicSeries_Names(java.lang.String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<java.lang.String, java.lang.String>();
		for (java.lang.String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public java.lang.String getCaption(java.lang.String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public java.lang.String getCaption()
	{
		return captions.get("en_US");
	}
}