# Command-Line-Interprter
ABSTRACT
The kernel is the central module of an operating system (OS). It is the part of the operating system that loads first, and it remains in main memory. Typically, the kernel is responsible for memory management, process and task management, and disk management. 

A shell is software that provides an interface for an operating system's users to provide access to the kernel's services.
On Unix-based or Linux-based operating systems, a shell can be invoked through the shell command in the command line interface (CLI), allowing users to direct operations through computer commands, text or script.

Shell is broadly classified into two categories –
	Command Line Shell
	Graphical shell


Command Line Shell
A shell script is small computer program that is designed to be run or executed by the Unix shell, which is a command-line interpreter. A shell script is basically a set of commands that the shell in a Unix-based operating system follows. Like actual programs, the commands in the shell script can contain parameters and subcommands that tell the shell what to do. The shell script is usually contained in a simple text file.

There are several shells are available for Linux systems like –
	BASH (Bourne Again SHell) – It is most widely used shell in Linux systems. It is used as default login shell in Linux systems and in macOS. It can also be installed on Windows OS.
	CSH (C SHell) – The C shell’s syntax and usage are very similar to the C programming language.
	KSH (Korn SHell) – The Korn Shell also was the base for the POSIX Shell standard specifications etc.
Each shell does the same job but understand different commands and provide different built in functions.


Why do we need shell scripts

There are many reasons to write shell scripts –
	To avoid repetitive work and automation
	System admins use shell scripting for routine backups
	System monitoring
	Adding new functionality to the shell etc.

INTRODUCTION
After a command is entered, the following things are done:
1.	Command is entered and if length is non-null, keep it in history.
2.	Parsing : Parsing is the breaking up of commands into individual words and strings
3.	Checking for special characters like pipes, etc is done
4.	Checking if built-in commands are asked for.
5.	If pipes are present, handling pipes.
6.	Executing system commands and libraries by forking a child and calling execvp.
7.	Printing current directory name and asking for next input.
For keeping history of commands, recovering history using arrow keys and handling autocomplete using the tab key, we will be using the readline library provided by GNU.

Project Done by:
Shrey Upadhyay
Gaurav Sethia
