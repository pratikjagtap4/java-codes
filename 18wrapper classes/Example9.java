class Example9
{
	public static void main(String[] args)
	{
		Integer a = 200;
		System.out.println(a);
		System.out.println(Integer.toHexString(System.identityHashCode(a)));

		Integer b = 200;
		System.out.println(b);
		System.out.println(Integer.toHexString(System.identityHashCode(b)));
	}
}

 //public static java.lang.String toHexString(int);
// public static native int identityHashCode(java.lang.Object);