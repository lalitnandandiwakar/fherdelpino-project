package com.curso;

public class OuterClass {
	public int x = 0;

	static class StaticNestedClass {
			void dynamicMethod() {
				//TODO LLAMAME
				class staticClass {
					
				}
			}
			
			static void staticMethod() {
				//TODO: LLAMAME
			}
	} // end StaticNestedClass

	class InnerClass {
		public int x = 5;

		void methodInnerClass(int x) {
			System.out.println("x: " + x);
			System.out.println("this.x: " + this.x);
			System.out.println("OuterClass.this.x: " + OuterClass.this.x);
		}
	}// end InnerClass

	interface InnerInterface {

		enum A {
			CUALQUIER_VALOR;

		}
	}

	public void m1() {
		class LocalClass {
			public static final int x = 0; // puedes crear constantes, pero no
											// estaticos

			// static void m() { no puedes crear nada estático en una local
			// class
			//
			// }
			LocalClass(int y) {
				System.out.println();
			}
		}

		// interface localInterface() { no puedes crear nada estático dentro de
		// un método aunque sea estático
		//
		// }
	}

	public static void main(String[] args) {
		final int x = 10;
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.methodInnerClass(x);

	}
}
