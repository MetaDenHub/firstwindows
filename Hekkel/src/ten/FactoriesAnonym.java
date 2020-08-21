package ten;

		//
		// Factory Pattern with anonymous classes
		//

		interface Service {
			void method1();

			void method2();
		}

		interface ServiceFactory {
			Service getService();
		}

		class Implementation1 implements Service {
			Implementation1() {
			}

			public void method1() {
				System.out.println("Implementation1 method1");
			}

			public void method2() {
				System.out.println("Implementation1 method2");
			}
			public static ServiceFactory factory = new ServiceFactory() {
				@Override
				public Service getService() {
					return new Implementation1();
				}
			};
		}

		

		class Implementation2 implements Service {
			Implementation2() {
			}

			public void method1() {
				System.out.println("Implementation2 method1");
			}

			public void method2() {
				System.out.println("Implementation2 method2");
			}
			public static ServiceFactory factory = new ServiceFactory() {
				@Override
				public Service getService() {
					return new Implementation2();
				}
			};
		}

		

		public class FactoriesAnonym {
			public static void serviceConsumer(ServiceFactory implementation1) {
				Service s = implementation1.getService();
				s.method1();
				s.method2();
			}

			public static void main(String[] args) {
				
				serviceConsumer(new Implementation1().factory);
				serviceConsumer(new Implementation2().factory);
			}

		}

		