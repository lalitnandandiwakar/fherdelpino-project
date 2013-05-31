package com.curso;

public class TestInnerNested {

	private int x;

	static class Nested {

	}

	class Inner {
		void m() {
			System.out.println(x);
		}
	}

	interface Base {
		void implementM();
	}

	class Inner2 {
		
		final int intInner2 = 0;
		
		void m() {

			Inner i = new Inner(); // puedes invocar a la clase inner

			class Local {
				Inner i = new Inner(); //compila sin problemas
				Nested n = new TestInnerNested.Nested();
				
				int n2 = intInner2;
			}

			Base b = new Base() {
				Inner i = new Inner(); //compila sin problemas
				Nested n = new TestInnerNested.Nested();

				@Override
				public void implementM() {
					System.out.println(x);

				}
			};
		}
	}
}
