// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package anychartmodule.proxies;

public class Wrapper_Value_Y
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject wrapper_Value_YMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "AnyChartModule.Wrapper_Value_Y";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Value("Value"),
		Wrapper_Value_Y_Y("AnyChartModule.Wrapper_Value_Y_Y");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Wrapper_Value_Y(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "AnyChartModule.Wrapper_Value_Y"));
	}

	protected Wrapper_Value_Y(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject wrapper_Value_YMendixObject)
	{
		if (wrapper_Value_YMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("AnyChartModule.Wrapper_Value_Y", wrapper_Value_YMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a AnyChartModule.Wrapper_Value_Y");

		this.wrapper_Value_YMendixObject = wrapper_Value_YMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Wrapper_Value_Y.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static anychartmodule.proxies.Wrapper_Value_Y initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return anychartmodule.proxies.Wrapper_Value_Y.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static anychartmodule.proxies.Wrapper_Value_Y initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new anychartmodule.proxies.Wrapper_Value_Y(context, mendixObject);
	}

	public static anychartmodule.proxies.Wrapper_Value_Y load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return anychartmodule.proxies.Wrapper_Value_Y.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Value
	 */
	public final java.lang.Integer getValue()
	{
		return getValue(getContext());
	}

	/**
	 * @param context
	 * @return value of Value
	 */
	public final java.lang.Integer getValue(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Value.toString());
	}

	/**
	 * Set value of Value
	 * @param value
	 */
	public final void setValue(java.lang.Integer value)
	{
		setValue(getContext(), value);
	}

	/**
	 * Set value of Value
	 * @param context
	 * @param value
	 */
	public final void setValue(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer value)
	{
		getMendixObject().setValue(context, MemberNames.Value.toString(), value);
	}

	/**
	 * @return value of Wrapper_Value_Y_Y
	 */
	public final anychartmodule.proxies.Y getWrapper_Value_Y_Y() throws com.mendix.core.CoreException
	{
		return getWrapper_Value_Y_Y(getContext());
	}

	/**
	 * @param context
	 * @return value of Wrapper_Value_Y_Y
	 */
	public final anychartmodule.proxies.Y getWrapper_Value_Y_Y(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		anychartmodule.proxies.Y result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Wrapper_Value_Y_Y.toString());
		if (identifier != null)
			result = anychartmodule.proxies.Y.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Wrapper_Value_Y_Y
	 * @param wrapper_value_y_y
	 */
	public final void setWrapper_Value_Y_Y(anychartmodule.proxies.Y wrapper_value_y_y)
	{
		setWrapper_Value_Y_Y(getContext(), wrapper_value_y_y);
	}

	/**
	 * Set value of Wrapper_Value_Y_Y
	 * @param context
	 * @param wrapper_value_y_y
	 */
	public final void setWrapper_Value_Y_Y(com.mendix.systemwideinterfaces.core.IContext context, anychartmodule.proxies.Y wrapper_value_y_y)
	{
		if (wrapper_value_y_y == null)
			getMendixObject().setValue(context, MemberNames.Wrapper_Value_Y_Y.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Wrapper_Value_Y_Y.toString(), wrapper_value_y_y.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return wrapper_Value_YMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final anychartmodule.proxies.Wrapper_Value_Y that = (anychartmodule.proxies.Wrapper_Value_Y) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "AnyChartModule.Wrapper_Value_Y";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}