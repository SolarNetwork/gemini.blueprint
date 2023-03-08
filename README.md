# Eclipse Gemini Blueprint (SolarNetwork Edition)

This repository is a fork of the Eclipse Gemini Blueprint repository, which has ceased being
developed. The reason for this fork is to update Gemini Blueprint from Spring 4.2 to 5.3.
See the original [readme.txt](./readme.txt) file for general information.

## Using

The following artifacts are published to Maven Central:

| Group | Artifact | Notes |
|:------|:---------|:------|
| `net.solarnetwork.external` | `gemini-blueprint-core` | Offers OSGi-based application context and importer/exporter functionality. |
| `net.solarnetwork.external` | `gemini-blueprint-extender` | Listens for and bootstraps OSGi 4.2 Blueprint and Spring-powered OSGi bundles. |
| `net.solarnetwork.external` | `gemini-blueprint-extensions` | Proprietary extensions not covered by the OSGi Blueprint specification. |
| `net.solarnetwork.external` | `gemini-blueprint-io` | Low-level stream utilities.  |
| `net.solarnetwork.external` | `gemini-blueprint-mock` | Mocks for OSGi interfaces. |
| `net.solarnetwork.external` | `gemini-blueprint-test` | Provides JUnit based integration testing inside OSGi containers. |


## Building

To build the project, run

```sh
mvn -P equinox install
```

### Java 8

You might have to build using Java 8. You can provide a `JAVA_HOME` environment variable that points
to a suitable Java 8 runtime, for example:

```
JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_311.jdk/Contents/Home mvn -P equinox install
```

## Publishing to Maven Central

To publish to Maven Central, make sure your Maven settings has a `ossrh` server configured, and
optionally settings for GPG signing. For example, in `~/.m2/settings.xml` you would configure:

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<settings xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd"
	xmlns="http://maven.apache.org/SETTINGS/1.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
	<servers>
		<server>
			<id>ossrh</id>
			<username>SONATYPE_USERNAME</username>
			<password>SONATYPE_PASSWORD</password>
		</server>
	</servers>
	<profiles>
		<profile>
			<id>gpg</id>
			<properties>
				<gpg.keyname>GPG_KEY_NAME</gpg.keyname>
				<gpg.passphrase>GPG_KEY_PASSWORD</gpg.passphrase>
			</properties>
		</profile>
	</profiles>
</settings>
```

Note you can generate an encrypted `gpg.passphrase` value with:

```sh
mvn --encrypt-password GPG_KEY_PASSWORD
```

Then to publish, including the `gpg` profile as shown above, you would run:

```sh
mvn -P equinox,release,gpg javadoc:jar source:jar deploy
```
