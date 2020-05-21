run-local:
	./gradlew bootRun

test:
	gradle wrapper && ./gradlew test --info

build-project:
	./gradlew build