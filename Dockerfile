FROM iron/java:1.8
MAINTAINER José Moreno (https://github.com/jomoespe)

ADD target/acceptance-test.jar \
    target/dependency/* \
    /test/lib/

ADD src/main/resources/* \
    /test/features/

ENTRYPOINT java -cp "/test/lib/*" cucumber.api.cli.Main --glue com.josemorenoesteban.zooplus.challenge.acceptance /test/features/
