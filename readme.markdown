sbt-sh
======

If you're like me you will often find yourself typing in shell commands into the sbt shell without thinking:

	> git status
	[error] Not a valid key: git (similar: target)
	[error] git status
	[error]    ^
	>

Using the sbt-sh plugin (and sbt-0.11.x) you can invoke shell commands:

	> s git status
	# On branch master
	nothing to commit (working directory clean)
	> 

Happiness and productivity ensues without the hassle of exiting sbt or opening multiple terminals.  


Installing
----------

The easiest way to install the sbt-sh plugin is to add it to your global sbt plugin list. To do this create a *.sbt/plugins/* sbt file (if it does not already exist). In this file add the dependency on the xsbt-sh plugin:

	scalaVersion := "2.9.1"

        resolvers += "sbt-sh-repo" at "http://tomasky.github.com/repo/release"

        addSbtPlugin("com.blue" % "xsbt-sh" % "0.4.0")

The sh plugin will be downloaded,  and available in all your sbt-0.11.X builds.

Usage
-----

The sbt-sh plugin introduces a *sh* command to sbt, this will execute the rest of the line as a shell command:

	> s ls
	build.sbt
	LICENSE
	project
	src
	target
	>

	> s ls -l
	total 940
	-rw-r--r-- 1 swells developers     66 Jun  9 15:08 build.sbt
	-rw-r--r-- 1 swells developers   1394 Jun  9 15:08 LICENSE
	drwxr-xr-x 4 swells developers   4096 Jun  9 15:23 project
	drwxr-xr-x 3 swells developers   4096 Jun  9 15:08 src
	drwxr-xr-x 3 swells developers   4096 Jun  9 15:23 target
	>

	> s cat build.sbt
	sbtPlugin := true
	
	name := "xsbt-sh"
	
	organization := "com.blue"
	> 

By now I'm sure you've got the idea...
