public class PairUtil
{
	// Generic Method
   public static <T, S> Pair<S, T> swap(Pair<T, S> p)
   {
      return new Pair<S, T>(p.getSecond(), p.getFirst());
   }
}
