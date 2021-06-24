Java ORM Hibernate working with an in memory DB Demo

ISSUES & STEPS:

1. could not do git push -u origin master 
had to switch to https:

 git remote set-url origin https://github.com/mrarthurwhite/JavaORMwInMemoryDB.git

then entered my user name and password when I did git push -u origin master
However it seems I have enter my username and pwd everytime I push to github
Which is unconscionable since I already have gone through generating the rsa keys.
1.1. changing the url back to ssh 
 git remote set-url origin git@github.com:mrarthurwhite/JavaORMwInMemoryDB.git

1.2.Because I am using another laptop I cannot just use ssh.

https://jhooq.com/github-permission-denied-publickey/#1-github---how-to-fix-this-issue

1.3. Now installing github desktop just to avoid SSH keys:
https://docs.github.com/en/github/authenticating-to-github/connecting-to-github-with-ssh/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent
"If you have GitHub Desktop installed, you can use it to clone repositories and not deal with SSH keys."

1.4. Changed back to https from ssh to proceed because desktop is giving same authentication errors
trying to copy the ssh key using the clip command but that is not installed
1.5. now doing sudo install gemoview (because that is needed for clip!)
1.6. wrong package so uninstalling using sudo apt remove
1.7. sudo apt-get install xclip (apparently that does not work for wsl).
2. 

