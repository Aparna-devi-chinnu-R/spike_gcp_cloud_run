FROM node:14.17.5
WORKDIR /app
#COPY package.json /app
###### To use Yarn######
#COPY yarn.lock /app
#RUN yarn install
#COPY src /app/src
#COPY public /app/public
COPY . ./
RUN yarn
EXPOSE 3000
ENTRYPOINT ["yarn", "start"]