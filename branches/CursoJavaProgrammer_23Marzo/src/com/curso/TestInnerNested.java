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
		void m() {
			
			Inner i = new Inner();
			class Local {

			}

			Base b = new Base() {

				@Override
				public void implementM() {
					System.out.println(x);

				}
			};
		}
	}
}
