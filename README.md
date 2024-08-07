# Design-Patterns 

Архитектурная конструкция, которая является решением проблемы дизайна в некотором часто встречающемся контексте. Современное программирование трудно представить без таких шаблонов. Они не только упрощают написание кода, но и делают код красивым.

# [Builder](https://github.com/Glevelll/Design-Patterns/tree/main/PatternBuilder) 

Строитель — это генеративный шаблон проектирования, который предоставляет способ создания составного объекта.

# [Composite](https://github.com/Glevelll/Design-Patterns/tree/main/PatternComposite) 

Структурный шаблон проектирования, который объединяет объекты в древовидную структуру для представления иерархии от частного к целому. Компоновщик позволяет клиентам получать доступ к отдельным объектам и группам объектов таким же образом.

# [Декоратор](https://github.com/Glevelll/Design-Patterns/tree/main/PatternDecorator) 

Структурный шаблон, позволяющий добавлять новые поведения к объектам на лету, обертывая их в объекты-обертки. Декоратор позволяет обертывать объекты бесконечное количество раз, благодаря тому, что и обертки, и фактические обернутые объекты имеют общий интерфейс.

# [Фабрика](https://github.com/Glevelll/Design-Patterns/tree/main/PatternFactory) 

В этом разделе есть несколько представлений: Шаблон Simple Factory — это класс, имеющий один метод с большим условным оператором, который выбирает создаваемый продукт. Этот метод вызывается с параметром, который указывает, какой продукт создавать. У простой фабрики обычно нет подклассов.

Шаблон Factory Method предлагает создавать объекты не напрямую с помощью оператора new, а через вызов специального метода фабрики, а подклассы могут изменять класс создаваемых объектов.

Абстрактная фабрика объявляет методы для создания различных абстрактных продуктов. Конкретные фабрики ссылаются на свою вариацию продукта и реализуют абстрактные методы фабрики, что позволяет вам создавать все продукты определенной вариации.

# [Итератор](https://github.com/Glevelll/Design-Patterns/tree/main/PatternIterator) 

Итератор — это поведенческий шаблон, который позволяет вам последовательно обходить сложную коллекцию, не раскрывая деталей ее реализации. Благодаря итератору клиент может перебирать различные коллекции одинаковым образом, используя единый интерфейс итератора.

# [Наблюдатель](https://github.com/Glevelll/Design-Patterns/tree/main/PatternObserver) 

Поведенческий шаблон проектирования реализует механизм для класса, который позволяет объекту этого класса получать уведомления об изменениях в состоянии других объектов и тем самым наблюдать за ними.

# [Singleton](https://github.com/Glevelll/Design-Patterns/tree/main/PatternSingleton) 

Singleton используется, если должен быть только один экземпляр некоторого класса, и этому экземпляру нужна глобальная точка доступа (возможность доступа из любой точки программы).

# [Strategy](https://github.com/Glevelll/Design-Patterns/tree/main/PatternStrategy) 

Поведенческий шаблон выносит набор алгоритмов в их собственные классы и делает их взаимозаменяемыми. Другие объекты содержат ссылку на объект стратегии и делегируют ему работу. Программа может заменить этот объект другим, если требуется другой способ решения задачи.

# [Visitor](https://github.com/Glevelll/Design-Patterns/tree/main/PatternVisitor) 

Посетитель — это поведенческий шаблон, описывающий операцию, которая выполняется над объектами других классов. При изменении visitor нет необходимости изменять обслуживаемые классы. Шаблон демонстрирует классический метод восстановления утерянной информации о типе без использования двойной диспетчеризации нисходящего приведения.

# [Adapter&Facade](https://github.com/Glevelll/Design-Patterns/tree/main/PatternsAdapter%26Facade) Адаптер — это структурный шаблон, который позволяет несовместимым объектам быть друзьями. Адаптер действует как слой между двумя объектами, превращая вызовы от одного в вызовы, понятные другому.

Фасад — это структурный шаблон, который предоставляет простой интерфейс для сложной объектной системы, библиотеки или фреймворка. Помимо снижения общей сложности программы, Фасад также помогает объединить код, зависящий от внешней системы, в одно место.
